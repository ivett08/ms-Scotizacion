package com.msproducto.entity;


	import java.io.Serializable;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.SequenceGenerator;
	import javax.persistence.Table;

	@Entity //Identificamos que trabajamos con un objeto o entidad en una BD
	@Table (name ="PRODUCTO")//Indicamos el nombre de la tabla en la bd


	public class Producto implements Serializable{
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
		public Producto() {
			
		}
		

		public Producto(int productoId) {
			this.productoId = productoId;
		}


		@Id
		@GeneratedValue(strategy=GenerationType.SEQUENCE, generator= "pid_auto")//Equivale al trigger de SQL
		@SequenceGenerator(name="pid_auto", sequenceName="PRODUCTO_SEQ", allocationSize=1)
		
		@Column(name="ID_PRODUCTO", columnDefinition="NUMBER")
		private int productoId;
		@Column(name="NOMBRE", columnDefinition="NVARCHAR2(30)")
		private String nombre;
		@Column(name="DESCRIPCION", columnDefinition="NVARCHAR2(30)")
		private String descripcion;
		@Column(name="PRECIO", columnDefinition="NUMBER")
		private float precio;
		
		
		public int getProductoId() {
			return productoId;
		}
		public void setProductoId(int productoId) {
			this.productoId = productoId;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getDescripcion() {
			return descripcion;
		}
		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		public float getPrecio() {
			return precio;
		}
		public void setPrecio(float precio) {
			this.precio = precio;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}


}
