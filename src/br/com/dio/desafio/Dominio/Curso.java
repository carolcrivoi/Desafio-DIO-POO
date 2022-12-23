package br.com.dio.desafio.Dominio;

public class Curso extends Conteudo {

    private int cargaHoraria;

    @Override
    public double calcularXp() {
        // TODO Auto-generated method stub
        return XP_PADRAO * cargaHoraria;
    }

    public Curso() {

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

    public void setCargaHoraria(String string) {
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

}
