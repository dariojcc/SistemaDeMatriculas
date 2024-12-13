package Servicios;

import Entidades.*;

public class CursoService {

    private final CursoEntity[] cursos;

    public CursoService() {
        this.cursos = new CursoEntity[12];
    }

    public void AddCurso(CursoEntity curso) {
        for (int i = 0; i < this.cursos.length; i++) {
            if (this.cursos[i] == null) {
                this.cursos[i] = curso;
                break;
            }
        }
    }

    public CursoEntity GetCurso(int id) {
        for (CursoEntity curso : this.cursos) {
            if (curso != null && curso.GetId() == id) {
                return curso;
            }
        }
        return null;
    }

    public String[][] GetCursos() {
        String[][] cursosInfos = new String[4][1000];
        for (int i = 0; i < this.cursos.length; i++) {
            if (this.cursos[i] != null) {
                cursosInfos[i] = this.cursos[i].ShowInfo();
            }
        }
        return cursosInfos;
    }

}
