package com.atis.zadanie1.Etnity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="Users_example")
public class User {

    // należy stworzyć 4 kolumny w naszej tabeli bazy danych.

    // pierwsza z nich to ID, zmienna przechowująca identyfikatory użytkowników formatów long,
    // będzie generowane przed adnotacje @GeneratedValue(strategy = GenerationType.IDENTITY)

    // kolejne trzy kolumny to kolejno, imie, email i hasło. Należy pamiętać, że dane w kolumnie email powinny być
    // unikalne i niepuste.
}
