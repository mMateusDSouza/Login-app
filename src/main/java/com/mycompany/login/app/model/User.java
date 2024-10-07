/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login.app.model;

import org.mindrot.jbcrypt.BCrypt;
/**
 * Classe User representa um usuário no sistema.
 * As senhas são armazenadas de forma segura utilizando o BCrypt.
 * 
 * @author Mateus
 */
public class User {
    private String name;
    private String email;
    private String password;
    
    /**
     * Construtor para criar um novo usuário.
     * 
     * @param name O nome do usuário.
     * @param email O e-mail do usuário.
     * @param password A senha do usuário (será criptografada com BCrypt).
     */
    
    public User(String name, String email, String password){
        this.name = name;
        this.email = email;
        setPassword(password);
    }
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getPassword(){
        return password;
    }
    
    /**
     * Define a senha do usuário, criptografando-a com BCrypt.
     * 
     * @param password A senha do usuário (será criptografada).
     */
    
    public void setPassword(String password){
        this.password = BCrypt.hashpw(password, BCrypt.gensalt());
    }
    
    /**
     * Verifica se a senha fornecida corresponde ao hash da senha armazenado.
     * 
     * @param password A senha a ser verificada.
     * @return true se a senha estiver correta, false caso contrário.
     */
    
    public boolean checkPassword(String password){
        return BCrypt.checkpw(password, this.password);
    }
    
}
