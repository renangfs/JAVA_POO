### Classes e Objetos

# Classe

    class Aluno{
        //Atributo
        private String Nome;
        //Métodos
        public void inserirNome(){
          Nome = System.in.toString();
        }
        public String recuperarNome(){
          return Nome;
      }
    }
  # instância de classe

      Aluno objetoAluno; //declaração
      objetoAluno = new Aluno(); //instanciação
