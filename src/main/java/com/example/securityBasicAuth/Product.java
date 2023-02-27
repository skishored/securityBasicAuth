package com.example.securityBasicAuth;

import java.util.*;

class Product
{
    private int m_prodID;
    private String m_prodName;

    Product()
    {
        m_prodID = -1;		// Initialize to some value
        m_prodName = "";
    }
    Product(int newID, String newName)	// Overload the constructor
    {
        m_prodID = newID;
        m_prodName = newName;
    }

    // Methods to get and set the values
    public int GetID()  {
        return m_prodID;
    }
    public String GetName() {
        return m_prodName;
    }
    public void SetID(int newID) {
        m_prodID = newID;
    }
    public void SetName(String newName) {
        m_prodName = newName;
    }

    public void PrintValues() {
        System.out.println(m_prodID + " " + m_prodName);
    }

}