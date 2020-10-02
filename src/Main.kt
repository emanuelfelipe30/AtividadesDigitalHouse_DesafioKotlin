fun main(){
    val digitalHouseManager = DigitalHouseManager()

    //testes - curso
    digitalHouseManager.registrarCurso("ADS",1,1)
    digitalHouseManager.registrarCurso("SI",2,4)
    digitalHouseManager.registrarCurso("Engenharia",3,10)
    digitalHouseManager.excluirCurso(3)
    digitalHouseManager.excluirCurso(5)
    println(digitalHouseManager.cursos)

    //testes - professor
    digitalHouseManager.registrarProfessorAdjunto("Flávio","Monteiro",1, 7)
    digitalHouseManager.registrarProfessorAdjunto("Creuza","Rolim",2, 9)
    digitalHouseManager.registrarProfessorTitular("Vianei","Peixoto",3, "Métodos numéricos")
    digitalHouseManager.registrarProfessorTitular("Robson","Raabi",4, "Física")
    digitalHouseManager.excluirProfessor(1)
    digitalHouseManager.excluirProfessor(5)
    digitalHouseManager.excluirProfessor(3)
    println(digitalHouseManager.professores)

    //testes - aluno
    digitalHouseManager.matricularAluno("Emanuel","Tavares",1)
    digitalHouseManager.matricularAluno("Suellington","Gomes",2)
    digitalHouseManager.matricularAluno("Joana","Silva",3)
    println(digitalHouseManager.alunos)

    //testes - aluno/curso
    digitalHouseManager.matricularAluno(1,1)
    digitalHouseManager.matricularAluno(2,1)
    digitalHouseManager.matricularAluno(5,1)
    digitalHouseManager.matricularAluno(1,5)
    println(digitalHouseManager.cursos)

    //testes - professor/curso
    digitalHouseManager.alocarProfessores(1,4,2)
    digitalHouseManager.alocarProfessores(1,2,4)
    digitalHouseManager.alocarProfessores(1,3,8)
    println(digitalHouseManager.cursos)

}