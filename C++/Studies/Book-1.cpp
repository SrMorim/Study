#include <iostream>
#include <stdio.h>

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





int main() {
    //Run
    VarTypes();
}