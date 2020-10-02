class Curso(val nome: String, val codigoCurso: Int, private val quantidadeMaximaDeAlunos: Int) {

    var professorTitular: ProfessorTitular? = null

    var professorAdjunto: ProfessorAdjunto? = null

    private val alunosMatriculados = mutableListOf<Aluno>()

    fun adicionarUmAluno(umAluno: Aluno): Boolean = if(alunosMatriculados.size < quantidadeMaximaDeAlunos) alunosMatriculados.add(umAluno) else false

    fun excluirAluno(umAluno: Aluno) { alunosMatriculados.remove(umAluno) }
    override fun toString(): String {
        return "Curso(nome='$nome', codigoCurso=$codigoCurso, quantidadeMaximaDeAlunos=$quantidadeMaximaDeAlunos, professorTitular=$professorTitular, professorAdjunto=$professorAdjunto, alunosMatriculados=$alunosMatriculados)"
    }


}