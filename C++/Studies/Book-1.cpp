#include <iostream>
#include <stdio.h>
#include <cstdlib>

void HelloWorld() {
    std::cout << "Hello world!!!\n" << std::endl;
}

void Howdy() {
    std::cout << "Howdy\n";
}

void Albuns() {
    std::cout << "Heaven or Hell\n";
    std::cout << "Love Sick\n";
    std::cout << "Life of a Don\n";
    std::cout << "HARDSTONE PSYCHO\n";
    std::cout << "DAYS BEFORE RODEO\n";
}

void MessageBunny() {
    std::cout << "_________________\n";
    std::cout << "| Meta: aprender|\n";
    std::cout << "|      c++      |\n";
    std::cout << "|_______________|\n";
    std::cout << "(\\__/) ||      \n";
    std::cout << "(•ㅅ•) ||\n";
    std::cout << "/   づ \n";
}

void VarTypes(){
    
    //Strings
    std::string nome = "felipe";
    nome = "Felipe";
    
    //Numeros inteiros
    int idade = 5;
    idade = 10;

    //Números quebrados
    double nota = 5;
    nota = 12.4;

    //Valor booleano
    bool matricula;
    matricula = false;

    std::cout << nome << std::endl;
    std::cout << idade << std::endl;
    std::cout << nota << std::endl;
    std::cout << matricula << std::endl;

    int reddit = 34;
    std::cout << reddit << std::endl;
}

void Restaurant() {
    double pizza = 40;
    double coke = 14.99;
    double total = pizza + coke;
    std::cout << "Total: "; std::cout << total << std::endl;
}

void Temperature() { //Fah > Cel
    double fah = 32; //Actual temp.
    double cel = (fah - 32) / 1.8;
    std::cout << "Temperature in celcius is: " << cel << std::endl;
}

void GameOfThrones() {
    std::string decorated = "Felipe";
    std::cout << "In the name of the Warrior, I charge you to be brave.\nIn the name of the Father, I charge you to be just.\nIn the name of the Mother, I charge you to defend the innocent.\nArise " << decorated << ", a knight of the Seven Kingdoms." << std::endl;
}

void LoginUser() {
    std::string username;

    std::cout << "Enter username: ";
    std::cin >> username;

    std::cout << "Logado como " << username << std::endl;
}

void MoM() {
    double mes1;
    double mes2;

    std::cout << "Primeiro mês: ";  std::cin >> mes1;
    std::cout << "Segundo mês: ";   std::cin >> mes2;

    double mom = (mes2 - mes1) / mes1 * 100;

    std::cout << "O troco é:" << mom << std::endl;
}

void CatYear() {
    double gato;

    std::cout << "Welcome to the Cat Years program! This only works for cats older than 2 years old." << std::endl;
    std::cout << "Enter your cat year's: "; std::cin >> gato;

    double idadegato = (gato - 2) * 4 + 24;

    std::cout << "Your cat is " << idadegato << " years old in human years." << std::endl;
}

void Coin() {
    srand(time(NULL));

    int num = std::rand() % 2;  // Generates a random number that's either 0 or 1

    if (num > 0.5) { 
        std::cout << "Heads\n";
    }
    else { 
    std::cout << "Tails\n";
    }
}

void febre() {
    double temperatura;

    std::cout << "Quantos gráus tem?: "; std::cin >> temperatura;

    if(temperatura > 38){
        std::cout << "Tá com febre.\n";
    } else {
        std::cout << "Tá de boa.\n";
    }
}

void Dices() {
    srand(time(NULL));
    
    int dice = std::rand() % 6;

    std::cout << "Resultado: " << dice << std::endl;
}

void FortuneCookies() {
    srand(time(NULL));

}



int main() {

    //Run
    Dices();
}