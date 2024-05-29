package entities;

import java.util.ArrayList;

public class Agendamento {
    private String id;
    private String pet;
    private String local;
    private ArrayList<String> servicos;
    private String data;
    private String horario;
    private float preco;
  

    public Agendamento(String id, String pet, String local, ArrayList<String> servicos, String data, String horario, float preco) {
        this.id = id;
        this.pet = pet;
        this.local = local;
        this.servicos = new ArrayList<String>();
        this.data = data;
        this.horario = horario;
        this.preco = preco;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
  
    public String getPet() {
        return pet;
    }
    public void setPet(String pet) {
        this.pet = pet;
    }
  
    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }
  
    public ArrayList<String> getServicos() {
        return servicos;
    }
    public void addServicos(String servico) {
        servicos.add(servico);
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

   public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }

    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
}
