import unittest
from model.usuario import Usuario

class TestUsuario(unittest.TestCase):
    def test_criacao_usuario(self):
        user = Usuario("Teste", "teste@email.com")
        self.assertEqual(user.nome, "Teste")
        self.assertEqual(user.email, "teste@email.com")

if __name__ == "__main__":
    unittest.main()
