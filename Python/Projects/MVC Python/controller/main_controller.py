from model.usuario import Usuario
from view.main_view import MainView

class MainController:
    def __init__(self):
        self.view = MainView()
    
    def run(self):
        self.view.show_main_screen()
