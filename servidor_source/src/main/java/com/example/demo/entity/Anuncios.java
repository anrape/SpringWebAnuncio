package com.example.demo.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import java.io.IOException;
import java.io.File;
import java.nio.file.Files;
@Entity
@Table(name = "anuncios")
public class Anuncios {
    @Id
    @GeneratedValue
    @Column(name = "id", unique = true, nullable = false)
    private Integer anuncioId;
    @Column(name = "titulo", unique = false, nullable = false, length = 20)
    private String titulo;
    @Column(name = "usuario_id", nullable = false)
    private Integer userId;
    @Column(name = "descripcion", length = 500)
    private String descripcion;
/* DESCARTADO
   @Lob
   @Column(name = "anuncio_imagen", nullable = true)
   
   private byte[] imagen;
   public void setImagen(String filename) {
   this.imagen = Anuncios.getByteImage(filename);
   
   }
   public static byte[] getByteImage(String filename) throws IOException {
   byte[] retorno = Files.readAllBytes(new File(filename).toPath());
   return retorno;
   } 
*/
}
