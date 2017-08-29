package com.alexecollins.docker.orchestration.model;

public class Depend {
    private final String value;

    public Depend(String value) {
        this.value = value;
    }

    public Id getId() {
        return new Id(value.replaceFirst(":.*", ""));
    }

    public String getAlias() {
        return value.contains(":") ? value.replaceFirst(".*:", "") : value;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Depend id = (Depend) o;

        return value.equals(id.value);

    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
