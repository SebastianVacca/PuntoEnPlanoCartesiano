public class Punto {
    //Atributos
    private Double x;
    private double y;

    //Constructores
    public Punto(){
        this(0.0, 0.0);
    }
    public Punto(Double x, Double y){
        this.x = x;
        this.y = y;
    }

    //Métodos getters
    public Double getX(){
        return this.x;
    }
    public Double getY(){
        return this.y;
    }

    //Métodos setters
    public void setX(double nuevoX){
        this.x = nuevoX;
    }
    public void sety(double nuevoY){
        this.y = nuevoY;
    }

    //Métodos de comportamiento
    public void mover(double deltaX, double deltaY){
        this.x += deltaX;
        this.y += deltaY;
    }
    public Double calcularDistancia(){
        double distancia = Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
        return distancia;
    }
    public String mostrarCoordenadas(){
        return String.format("X = %.1f, Y = %.1f",
                getX(), getY());
    }
}
