#-=Libs=-#
import os
import time
import requests
from stem import Signal
from stem.control import Controller
import getpass 
from bomb import *

#-=Functions=-#
#Auto Tor
def autotor():
    """
    Função principal que realiza trocas de IP utilizando a rede Tor,
    exibindo o IP público toda vez que for alterado.
    """

    def verificar_tor_instalado():
        """
        Verifica se o Tor está instalado no sistema.
        """
        if os.system("which tor > /dev/null 2>&1") != 0:
            raise RuntimeError("[ERRO] O Tor não está instalado. Instale-o primeiro.")

    def iniciar_tor():
        """
        Verifica se o serviço Tor está ativo e tenta iniciá-lo com permissões elevadas, se necessário.
        """
        print("[INFO] Verificando se o Tor está em execução...")
        if os.system("service tor status > /dev/null 2>&1") != 0:
            print("[INFO] Tor não está ativo. Iniciando o serviço...")
            senha = getpass.getpass("[+] Insira a senha de administrador para iniciar o Tor: ")
            os.system(f"echo {senha} | sudo -S service tor start")
            time.sleep(3)  # Aguarda alguns segundos para garantir que o Tor foi iniciado
        else:
            print("[INFO] Tor já está em execução.")

    def verificar_permissoes_cookie():
        """
        Verifica se o arquivo control.authcookie é acessível pelo usuário atual.
        """
        cookie_path = "/var/run/tor/control.authcookie"
        if not os.path.exists(cookie_path):
            raise RuntimeError("[ERRO] O arquivo control.authcookie não foi encontrado. O Tor está configurado corretamente?")
        if not os.access(cookie_path, os.R_OK):
            print("[ERRO] O arquivo control.authcookie não está acessível pelo usuário atual.")
            senha = getpass.getpass("[+] Insira a senha de administrador para ajustar permissões: ")
            os.system(f"echo {senha} | sudo -S chmod 644 {cookie_path}")

    def obter_ip_atual():
        """
        Obtém o IP público atual usando a rede Tor.
        """
        try:
            url = 'http://checkip.amazonaws.com'
            proxies = {
                'http': 'socks5://127.0.0.1:9050',
                'https': 'socks5://127.0.0.1:9050'
            }
            response = requests.get(url, proxies=proxies, timeout=10)
            response.raise_for_status()
            return response.text.strip()
        except requests.RequestException as e:
            print(f"[ERRO] Falha ao obter IP: {e}")
            return None

    def trocar_ip_tor():
        """
        Solicita ao Tor um novo circuito (novo IP) usando autenticação por cookie.
        """
        try:
            with Controller.from_port(port=9051) as controller:
                controller.authenticate()  # Autenticação automática via cookie
                controller.signal(Signal.NEWNYM)  # Solicita um novo circuito
                print("[INFO] Sinal enviado para trocar de IP.")
        except Exception as e:
            print(f"[ERRO] Falha ao trocar o IP: {e}")

    def iniciar_troca_ip(intervalo, iteracoes):
        """
        Realiza a troca de IPs a cada intervalo definido, exibindo o IP atual.
        """
        print("[INFO] Iniciando troca automática de IPs...")
        for i in range(iteracoes or float('inf')):  # Iterações infinitas se iteracoes for 0
            print(f"\n[INFO] Troca de IP número {i + 1}")
            trocar_ip_tor()
            ip = obter_ip_atual()
            if ip:
                print(f"[INFO] Novo IP obtido: {ip}")
            else:
                print("[INFO] Falha ao obter o novo IP.")
            print(f"[INFO] Aguardando {intervalo} segundos para a próxima troca...")
            time.sleep(intervalo)

    # Verifica se o Tor está instalado
    verificar_tor_instalado()

    # Inicia o serviço Tor, se necessário
    iniciar_tor()

    # Verifica permissões do arquivo de autenticação do Tor
    verificar_permissoes_cookie()

    # Configurações do usuário
    try:
        intervalo = int(input("[+] Tempo para troca de IP em segundos [padrão=60]: ") or 60)
        iteracoes = input("[+] Quantas trocas deseja? [Deixe vazio para troca infinita]: ")
        iteracoes = int(iteracoes) if iteracoes else 0

        iniciar_troca_ip(intervalo, iteracoes)
    except ValueError:
        print("[ERRO] Entrada inválida! Certifique-se de inserir números para intervalo e iterações.")
    except KeyboardInterrupt:
        print("\n[INFO] Processo interrompido pelo usuário. Finalizando...")
        mainmenu()
    mainmenu()
