package com.infinite.hiblibrary;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Books")
public class Books {
	    @Id
	    @Column(name="id")
		private int id;
	    @Column(name="name")
		private String name;
	    @Column(name="author")
		private String author;
	    @Column(name="edition")
		private String edition;
	    @Column(name="dept")
		private String dept;
	    @Column(name="TotalBooks")
		private int TotalBooks;
		@Override
		public String toString() {
			return "Books [id=" + id + ", name=" + name + ", author=" + author + ", edition=" + edition + ", dept="
					+ dept + ", TotalBooks=" + TotalBooks + "]";
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public String getEdition() {
			return edition;
		}
		public void setEdition(String edition) {
			this.edition = edition;
		}
		public String getDept() {
			return dept;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}
		public int getTotalBooks() {
			return TotalBooks;
		}
		public void setTotalBooks(int totalBooks) {
			TotalBooks = totalBooks;
		}
		
		
	}


