#Libs
import os
import sys
import socket
import concurrent.futures
import tqdm
from bomb import *
fr


def portscan():
    while True:
        os.system('cls' if os.name == 'nt' else 'clear')
        print(f'''\033[31m
            ░█▀█░█▀█░█▀▄░▀█▀░░░█▀▀░█▀▀░█▀█░█▀█
            ░█▀▀░█░█░█▀▄░░█░░░░▀▀█░█░░░█▀█░█░█ 
            ░▀░░░▀▀▀░▀░▀░░▀░░░░▀▀▀░▀▀▀░▀░▀░▀░▀
           -==================================-
\033[0m𝑻𝒂𝒓𝒈𝒆𝒕: {target}
𝑻𝒂𝒓𝒈𝒆𝒕 𝑰𝑷: {targetip}
''')
        options = str(input('[1]Start(1-1024 ports)\n[2]Start (specific Port)\n[3]Back\n[x]Exit\n>>> '))

        if options == '1':

            def scan_port(host, port):
                retries = 2
                for _ in range(retries):
                    try:
                        with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as s:
                            s.settimeout(1.0)
                            if s.connect_ex((host, port)) == 0:
                                return port
                    except socket.timeout:
                        pass
                    except OSError:
                        pass
                    except:
                        pass
                return None

            def port_scanner(host=targetip, start_port=1, end_port=1024):
                open_ports = []
                with concurrent.futures.ThreadPoolExecutor(max_workers=50) as executor:
                    futures = [executor.submit(scan_port, host, p) for p in range(start_port, end_port+1)]
                    for f in tqdm.tqdm(concurrent.futures.as_completed(futures), total=end_port-start_port+1, desc="Scanning ports"):
                        result = f.result()
                        if result:
                            open_ports.append(result)
                return open_ports

            results = port_scanner()
            print("Open ports:")
            for port in results:
                print(f'Port {port} open')

            save_option = str(input("Do you want to save the result to a file? [y/n]\n>>> "))
            if save_option.lower() == 'y':
                filename = str(input("Enter the filename (e.g., result.txt):\n>>> "))
                with open(filename, 'w') as file:
                    file.write(f'Target: {target}\n')
                    file.write(f'Target IP: {targetip}\n')
                    file.write('Open ports:\n')
                    for port in results:
                        file.write(f'Port {port} open\n')
                print(f'Results saved to {filename}')

            input("Press Enter to continue...")

        elif options == '2':
            specific_port = int(input("Enter the specific port to scan:\n>>> "))
            
            def scan_specific_port(host, port):
                try:
                    with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as s:
                        s.settimeout(1.0)
                        if s.connect_ex((host, port)) == 0:
                            return True
                except socket.timeout:
                    pass
                except OSError:
                    pass
                except:
                    pass
                return False

            if scan_specific_port(targetip, specific_port):
                print(f'Port {specific_port} is open')
            else:
                print(f'Port {specific_port} is closed')

            input("Press Enter to continue...")

        elif options == '3':
            attackmenu()
            break
        elif options == 'x':
            os.system('cls' if os.name == 'nt' else 'clear')
            break