package org.kuali.student.poc.xsd.learningunit.lu.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class LuiDisplay implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlAttribute
	private String luiId;
	@XmlElement
	private String luiCode;
	@XmlElement
	private String luTypeKey;
	@XmlElement
	private CluDisplay cluDisplay;
	@XmlElement
	private AtpDisplay atpDisplay;

	/**
	 * @return the luiId
	 */
	public String getLuiId() {
		return luiId;
	}

	/**
	 * @param luiId
	 *            the luiId to set
	 */
	public void setLuiId(String luiId) {
		this.luiId = luiId;
	}

	/**
	 * @return the luiCode
	 */
	public String getLuiCode() {
		return luiCode;
	}

	/**
	 * @param luiCode
	 *            the luiCode to set
	 */
	public void setLuiCode(String luiCode) {
		this.luiCode = luiCode;
	}

	/**
	 * @return the luTypeId
	 */
	public String getLuTypeKey() {
		return luTypeKey;
	}

	/**
	 * @param luTypeId
	 *            the luTypeId to set
	 */
	public void setLuTypeKey(String luTypeKey) {
		this.luTypeKey = luTypeKey;
	}

	/**
	 * @return the cluDisplay
	 */
	public CluDisplay getCluDisplay() {
		return cluDisplay;
	}

	/**
	 * @param cluDisplay
	 *            the cluDisplay to set
	 */
	public void setCluDisplay(CluDisplay cluDisplay) {
		this.cluDisplay = cluDisplay;
	}

	/**
	 * @return the atpDisplay
	 */
	public AtpDisplay getAtpDisplay() {
		return atpDisplay;
	}

	/**
	 * @param atpDisplay
	 *            the atpDisplay to set
	 */
	public void setAtpDisplay(AtpDisplay atpDisplay) {
		this.atpDisplay = atpDisplay;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((atpDisplay == null) ? 0 : atpDisplay.hashCode());
		result = prime * result
				+ ((cluDisplay == null) ? 0 : cluDisplay.hashCode());
		result = prime * result
				+ ((luTypeKey == null) ? 0 : luTypeKey.hashCode());
		result = prime * result + ((luiCode == null) ? 0 : luiCode.hashCode());
		result = prime * result + ((luiId == null) ? 0 : luiId.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final LuiDisplay other = (LuiDisplay) obj;
		if (atpDisplay == null) {
			if (other.atpDisplay != null)
				return false;
		} else if (!atpDisplay.equals(other.atpDisplay))
			return false;
		if (cluDisplay == null) {
			if (other.cluDisplay != null)
				return false;
		} else if (!cluDisplay.equals(other.cluDisplay))
			return false;
		if (luTypeKey == null) {
			if (other.luTypeKey != null)
				return false;
		} else if (!luTypeKey.equals(other.luTypeKey))
			return false;
		if (luiCode == null) {
			if (other.luiCode != null)
				return false;
		} else if (!luiCode.equals(other.luiCode))
			return false;
		if (luiId == null) {
			if (other.luiId != null)
				return false;
		} else if (!luiId.equals(other.luiId))
			return false;
		return true;
	}

}
