package com.atis.zadanie1.Repository;


import com.atis.zadanie1.Etnity.User;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface Repository extends   {
   // nasz interfejs Repository powinien dziedziczyć po klasie JpaRepository<User, [typ id]>


}
