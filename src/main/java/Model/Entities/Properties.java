/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Entities;

class Properties
{
    int x // atributo de exemplo para a explicação

    // Exemplo de como fazer sem properties
    public void setX(int x)
    {
	this.x = x;
    }
    public void getX()
    {
	return x;
    }
		
    // Exemplo de como fazer com properties
    public int X{
        get{return x;}
	set{this.x=value} // Value é o parametro inserido no código
    }
		
	
}