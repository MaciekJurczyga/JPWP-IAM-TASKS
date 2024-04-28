package com.atis.zadanie1.Repository;


import com.atis.zadanie1.Etnity.User;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface Repository extends   {
   // nasz interfejs Repository dziedziczyć po JpaRepository<User, [typ id]>


}
