void main() {
  //Run 
  message();
}

void helloworld() {
  print('Hello, World!');
}

void vartypes() {
  int idade = 18;
  String nome = 'Felipe';
  double altura = 165.03;
  bool alternativa = nome == 'marcus';
  print('$idade\n$nome\n$altura\n$alternativa');
}

void mathoperators() {
  int x = 10;
  int y = 15;
  double z = (x + y) * 1 - 10 / 2;
  print(z);
  
  x += 20;
  print(x);
  x++;
  print(x);
  x--;
  print(x);
}

void decision() {
  int nota = 6;
  //Alternativa 1
  if(nota > 7) {
    print('Aprovado!');
  } else if (nota >= 5){
    print('Fazer recuperação.');
  } else{
    print('Reprovado.');
  }
  //Alternativa 2
  int nota2 = 8;
  String boletim = nota2 >= 7 ? 'Aprovado' : 'Reprovado';
  print(boletim);
  //Alternativa 3
  int options = 2;
  switch(options) {
    case 1:
      print('Opção 1 Selecionada!');
      break;
    case 2:
      print('Opção 2 Selecionada!');
      break;
    case 3:
      print('Opção 3 Selecioanda!');
      break;
    default:
      print('Opção desconhecida');
  }
  
    
}

void logicoperators() {
  int x = 2006;
  bool resp = x != 1;
  print(!resp);
  // && (e) (todos verdadeiros para ser verdadeiro)
  // || (ou) (um verdadeira para ser verdadeiro)
  // ! (não) (Inverte resultado)
}

void whileloop() {
  int x = 1;
  while(x < 100){
    print(x);
    x++;
  }
  
}

void message() {
  void welcome(name) {
    print('Welcome! $name');
  }
  void person(){
    welcome('Felipe');
  }
  
  //Init
  person();
}

/*void welcome(String nome,{bool showtime = false, String? outrocliente}) {
  print('Bem vindo! $nome');
  if(showtime){
    print('Hoje é: ${tempo()}');
  } 
  if (outrocliente != null){
    print('bem vindo também ${outrocliente.toUpperCase()}');
    
  }
}

String tempo() {
  DateTime horas = DateTime.now();
  return horas.toString();
}*/

void logintosco(String user,{ String? pass}) {
  print('Logando como $user... aguarde');
  switch(user){
    case ('Felipe'):
      if(pass != null && pass == 'catatau'){
        print('Login na conta $user realizada com sucesso!');
      }else {
        print('Login inválido.');
      }
      break;
    default:
      print('Usuário ou Senha Inválidos');
      break;
  }
}





