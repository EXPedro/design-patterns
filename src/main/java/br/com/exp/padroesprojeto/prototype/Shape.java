package br.com.exp.padroesprojeto.prototype;

/** <b>Padrão Prototype</b>
 *  <p>
 *  Passo 1 - Criar uma classe abstrata
 *  que implementa a interface Cloneable
 */

public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    abstract void draw();

    public String getType(){
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
