package com.jcaa.universidad_hexagonal.adapter.out.persistence;

import jakarta.persistence.*;

@Entity
@Table(name = "universidades")
public class UniversityEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String categoria;
    private String web;
    private String rector;
    private String email;
    private String acceso;
    private String telefono;
    private String ciudad;
    private int numeroCarreras;
    private int numSedes;

    public UniversityEntity() {}

    public UniversityEntity(Long id, String nombre, String categoria, String web,
                            String rector, String email, String acceso, String telefono,
                            String ciudad, int numeroCarreras, int numSedes) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.web = web;
        this.rector = rector;
        this.email = email;
        this.acceso = acceso;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.numeroCarreras = numeroCarreras;
        this.numSedes = numSedes;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    public String getWeb() { return web; }
    public void setWeb(String web) { this.web = web; }

    public String getRector() { return rector; }
    public void setRector(String rector) { this.rector = rector; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getAcceso() { return acceso; }
    public void setAcceso(String acceso) { this.acceso = acceso; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }

    public int getNumeroCarreras() { return numeroCarreras; }
    public void setNumeroCarreras(int numeroCarreras) { this.numeroCarreras = numeroCarreras; }

    public int getNumSedes() { return numSedes; }
    public void setNumSedes(int numSedes) { this.numSedes = numSedes; }

}
