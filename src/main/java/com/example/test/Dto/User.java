package com.example.test.Dto;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "st_user")
public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
        @SequenceGenerator(name = "sequenceGenerator")
        private Long id;

        @NotNull
        @Column(length = 50, unique = true, nullable = false)
        private String login;

        @NotNull
        @Column(name = "password", length = 60, nullable = false)
        private String password;

        @Column(name = "fio", length = 100)
        private String fio;

        public User() {
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getLogin() {
                return login;
        }

        public void setLogin(String login) {
                this.login = login;
        }

        public String getPassword() {
                return password;
        }

        public void setPassword(String password) {
                this.password = password;
        }

        public String getFio() {
                return fio;
        }

        public void setFio(String fio) {
                this.fio = fio;
        }
}
