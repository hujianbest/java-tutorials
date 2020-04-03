package com.hujianbest.security;

/**
 * @author hujian
 */
public class SecurityTest {
    public static void main(String[] args) {
        SecurityManager securityManager = System.getSecurityManager();
        System.out.println(securityManager);
    }
}
