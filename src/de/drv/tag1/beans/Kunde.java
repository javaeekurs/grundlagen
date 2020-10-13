package de.drv.tag1.beans;

import java.io.Serializable;

// Java Bean / POJO
/*
 * - Default Constructor (also ohne Parameter)
 * - Muss Serialisierbar sein
 * - Es braucht Getter und Setter
 * - Es hat nur Eigenschaften
 * 
 * <kunde>
 *   <vorname>Bernd</vorname>
 *   // ..
 *</kunde>
 */

public class Kunde implements Serializable {

	
	private static final long serialVersionUID = 1L;
//	public Kunde(String vorname, String nachname)

	private int id = 0;
	private String vorname = null;
	private String nachname = null;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

}
