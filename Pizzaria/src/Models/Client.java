/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Gabriel
 */
public class Client {
    
    private String firstname;
    private String lastname;
    private String cpf;
    private Address address;
    
    private Client() {
        // Empty constructor
    }
    
    public static Client Build(){
        return new Client();
    }

    public String getFirstname() {
        return firstname;
    }

    public Client setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public String getLastname() {
        return lastname;
    }

    public Client setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public String getCpf() {
        return cpf;
    }

    public Client setCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public Address getAddress() {
        return address;
    }

    public Client setAddress(Address address) {
        this.address = address;
        return this;
    }
    
    public String getFullName(){
        return getFirstname()+" "+getLastname();
    }
    
    
}
