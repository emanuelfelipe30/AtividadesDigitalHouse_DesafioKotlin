abstract class Professor(private val nome: String, private val sobrenome: String, private val tempoCasa: Int, val codigoProfessor: Int) {
    override fun toString(): String {
        return "Professor(nome='$nome', sobrenome='$sobrenome', tempoCasa=$tempoCasa, codigoProfessor=$codigoProfessor)"
    }
}