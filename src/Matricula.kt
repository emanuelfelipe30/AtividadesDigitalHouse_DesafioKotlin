import java.time.LocalDateTime

class Matricula(val aluno: Aluno, val curso: Curso) {
    val dataMatricula: LocalDateTime = LocalDateTime.now()
}