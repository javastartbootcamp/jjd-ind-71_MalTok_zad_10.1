package pl.javastart.task;

import java.util.Objects;

public class Tank {
    private String name;
    private double mass;
    private int crew;

    public Tank(String name, double mass, int crew) {
        this.name = name;
        this.mass = mass;
        this.crew = crew;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public int getCrew() {
        return crew;
    }

    public void setCrew(int crew) {
        this.crew = crew;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Tank tank = (Tank) o;
        return Double.compare(tank.mass, mass) == 0
                && crew == tank.crew
                && Objects.equals(name, tank.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mass, crew);
    }

    @Override
    public String toString() {
        return "Czołg " + name +
                ", tonaż " + mass +
                ", załoga w liczbie " + crew + " osób";
    }
}
