import os
import sys
import subprocess
import shutil

def install_dependencies():
    try:
        print("Instalando dependências...")
        subprocess.check_call([sys.executable, "-m", "pip", "install", "--upgrade", "pip"])
        subprocess.check_call([sys.executable, "-m", "pip", "install", "yt-dlp"])
        print("Dependências instaladas com sucesso!")
    except subprocess.CalledProcessError as e:
        print("Erro ao instalar dependências:", e)
        sys.exit(1)

def create_launcher():
    # Obter caminho absoluto do main.py
    main_script = os.path.abspath("main.py")
    if not os.path.exists(main_script):
        print("Arquivo main.py não encontrado. Certifique-se de que ele está na mesma pasta do instalador.")
        sys.exit(1)

    if os.name == "nt":  # Windows
        # Cria um arquivo em lote que chama o main.py com o interpretador Python
        launcher_content = f'@echo off\r\n"{sys.executable}" "{main_script}" %*\r\n'
        # Tentar colocar o launcher na pasta Scripts (geralmente já está no PATH) ou na pasta do Python
        scripts_dir = os.path.join(os.path.dirname(sys.executable), "Scripts")
        if not os.path.isdir(scripts_dir):
            scripts_dir = os.path.dirname(sys.executable)
        launcher_path = os.path.join(scripts_dir, "YTLoader.bat")
        try:
            with open(launcher_path, "w", encoding="utf-8") as f:
                f.write(launcher_content)
            print(f"Launcher criado em: {launcher_path}")
            print("Certifique-se de que esta pasta esteja no PATH do sistema para chamar 'YTLoader' de qualquer lugar.")
        except Exception as e:
            print("Erro ao criar o launcher:", e)
            sys.exit(1)
    else:
        # Linux (e possivelmente macOS)
        # Cria um script shell que chama o main.py com o interpretador Python
        launcher_content = f'#!/bin/bash\n"{sys.executable}" "{main_script}" "$@"\n'
        # Se o usuário for root, podemos usar /usr/local/bin; senão, usamos ~/.local/bin (recomendado)
        if os.geteuid() == 0:
            launcher_dir = "/usr/local/bin"
        else:
            launcher_dir = os.path.expanduser("~/.local/bin")
            os.makedirs(launcher_dir, exist_ok=True)
        launcher_path = os.path.join(launcher_dir, "YTLoader")
        try:
            with open(launcher_path, "w", encoding="utf-8") as f:
                f.write(launcher_content)
            os.chmod(launcher_path, 0o755)
            print(f"Launcher criado em: {launcher_path}")
            print("Certifique-se de que este diretório esteja no PATH para chamar 'YTLoader' de qualquer lugar.")
        except Exception as e:
            print("Erro ao criar o launcher:", e)
            sys.exit(1)

def main():
    print("=== Instalador do YTLoader ===")
    install_dependencies()
    create_launcher()
    print("\nInstalação completa! Agora você pode executar o programa digitando 'YTLoader' no terminal.")

if __name__ == "__main__":
    main()
