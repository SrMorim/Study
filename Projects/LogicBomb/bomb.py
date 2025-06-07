#!/usr/bin/env python3
#-=Libs=-#
import os
import sys
import socket

#-=Imports=-#
from defense import *
from attack import *
from utils import *

#-=Menus=-#
#Main menu
def mainmenu():
     while True:
        os.system('cls' if os.name == 'nt' else 'clear')
        print(f'''
           __             _         ___             __ 
          / /  ___  ___ _(_)___    / _ )___  __ _  / / 
         / /__/ _ \/ _ `/ / __/   / _  / _ \/  ' \/ _ \\
        /____/\___/\_, /_/\__/   /____/\___/_/_/_/_.__/
                  /___/                                  
       -===============================================-
        Target:{target}
        Target IP:{targetip}
        Your IP:{myip}
        ''')
        option = input("[1]Defense\n[2]Attack\n[3]New Target\n[x]Exit\n>>> ")
        
        if option == "1":
          defensemenu()
          break
        elif option == "2":
          attackmenu()
          break
        elif option == "3":
          newtarget()
          break
        elif option == "x":
          print("bye...")
          break

#Defense Menu
def defensemenu():
     while True:
        os.system('cls' if os.name == 'nt' else 'clear')
        print(f'''
          ░█▀▄░█▀▀░█▀▀░█▀▀░█▀█░█▀▀░█▀▀
          ░█░█░█▀▀░█▀▀░█▀▀░█░█░▀▀█░█▀▀
          ░▀▀░░▀▀▀░▀░░░▀▀▀░▀░▀░▀▀▀░▀▀▀
         -============================-
          Target:{target}
          Target IP:{targetip}
          Your IP:{myip}
        ''')
        option = input("[1]Auto Tor\n[2]???\n[3]???\n[x]Back\n>>> ")
        
        if option == "1":
          autotor()
          break
        elif option == "2":
          break
        elif option == "3":
          break
        elif option == "x":
          mainmenu()
          break

#Attack Menu
def attackmenu():
     while True:
        os.system('cls' if os.name == 'nt' else 'clear')
        print(f'''
          ░█▀█░▀█▀░▀█▀░█▀█░█▀▀░█░█
          ░█▀█░░█░░░█░░█▀█░█░░░█▀▄
          ░▀░▀░░▀░░░▀░░▀░▀░▀▀▀░▀░▀
         -========================-
          Target:{target}
          Target IP:{targetip}
          Your IP:{myip}
        ''')
        option = input("[1]???\n[2]???\n[3]???\n[x]Back\n>>> ")
        
        if option == "1":
          break
        elif option == "2":
          break
        elif option == "3":
          break
        elif option == "x":
          mainmenu()
          break

#Target Info
def newtarget():
     os.system('cls' if os.name == 'nt' else 'clear')
     
     global target, targetip, myip

     print("""
     ░█▀█░█▀▀░█░█░░░▀█▀░█▀█░█▀▄░█▀▀░█▀▀░▀█▀
     ░█░█░█▀▀░█▄█░░░░█░░█▀█░█▀▄░█░█░█▀▀░░█░
     ░▀░▀░▀▀▀░▀░▀░░░░▀░░▀░▀░▀░▀░▀▀▀░▀▀▀░░▀░
    -======================================-
     """)
     target = input("New Target: ")
     targetip = socket.gethostbyname(target)
     mainmenu()

if __name__ == "__main__":
     #-=INFO=-#
     try:
          target = sys.argv[1]
     except Exception:
          print("""
     ░█▀█░█▀▀░█░█░░░▀█▀░█▀█░█▀▄░█▀▀░█▀▀░▀█▀
     ░█░█░█▀▀░█▄█░░░░█░░█▀█░█▀▄░█░█░█▀▀░░█░
     ░▀░▀░▀▀▀░▀░▀░░░░▀░░▀░▀░▀░▀░▀▀▀░▀▀▀░░▀░
    -======================================-
     """)
          target = input("New Target: ")
     targetip = socket.gethostbyname(target)
     myip = socket.gethostbyname(socket.gethostname())
    
    #-=Start=-#
     mainmenu()
    