class DigitalHouseManager {

    val alunos = mutableListOf<Aluno>()
    val professores = mutableListOf<Professor>()
    val cursos = mutableListOf<Curso>()
    private val matriculas = mutableListOf<Matricula>()

    fun registrarCurso(nome: String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int) {
        cursos.add(Curso(nome, codigoCurso, quantidadeMaximaDeAlunos))
    }

    fun excluirCurso(codigoCurso: Int) {
        val curso = cursos.firstOrNull { curso -> curso.codigoCurso == codigoCurso }
        if(curso != null) cursos.remove(curso)
    }

    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, quantidadeDeHoras: Int) {
        professores.add(ProfessorAdjunto(nome, sobrenome, 0, codigoProfessor, quantidadeDeHoras))
    }

    fun registrarProfessorTitular(nome: String, sobrenome: String , codigoProfessor: Int, especialidade: String ) {
        professores.add(ProfessorTitular(nome, sobrenome, 0, codigoProfessor, especialidade))
    }

    fun excluirProfessor(codigoProfessor: Int) {
        val professor = professores.firstOrNull { professor -> professor.codigoProfessor == codigoProfessor }
        if(professor != null) professores.remove(professor)
    }

    fun matricularAluno(nome: String , sobrenome: String , codigoAluno: Int) {
        alunos.add(Aluno(nome, sobrenome, codigoAluno))
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int){

        val curso = cursos.firstOrNull { curso -> curso.codigoCurso == codigoCurso }
        val aluno = alunos.firstOrNull { aluno -> aluno.codigoAluno == codigoAluno }

        if(curso!= null && aluno != null){

            if(curso.adicionarUmAluno(aluno)){

                matriculas.add(Matricula(aluno, curso))
                println("Matrícula realizada com sucesso")

            } else println("Não foi possível realizar a matrícula, pois não há mais vagas")

        } else println("Não foi possível realizar a matrícula, pois não há mais vagas")

    }

    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int) {

        val curso = cursos.firstOrNull { curso -> curso.codigoCurso == codigoCurso }
        val professorTitular = professores.firstOrNull { professor -> professor.codigoProfessor == codigoProfessorTitular }
        val professorAdjunto = professores.firstOrNull { professor -> professor.codigoProfessor == codigoProfessorAdjunto }

        if (curso != null && professorTitular != null && professorAdjunto != null &&
            professorTitular is ProfessorTitular && professorAdjunto is ProfessorAdjunto
        ) {

            curso.professorTitular = professorTitular
            curso.professorAdjunto = professorAdjunto

        }

    }

}