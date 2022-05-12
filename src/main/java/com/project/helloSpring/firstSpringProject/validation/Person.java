package com.project.helloSpring.firstSpringProject.validation;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;

/*
@Null
@NotNull
@Email
@Min
@Max
@Size
@AssertTrue - metoda musi zwracać boolean i
zaczynać się od is
@AssertFalse - metoda musi zwracać boolean i
zaczynać się od is

Adnotacje dostępne tylko w hibernate-validator:

@Length
@URL
@Range
@NIP, @PESEL, @REGON

<dependency>
    <groupId>org.hibernate</groupId>
    <artifactId>hibernate-validator</artifactId>
    <version>6.1.5.Final</version> <!--dostępna może być nowsza wersja-->
</dependency>
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @NotNull
    @Length(min = 3, max = 32, message = "first name has to be between 3 and 32 chars longs")
    private String firstName;

    private String address;

    /*
    W aplikacji webowej, która definiuje
    REST API, obiekty, które są walidowane,
    są najczęściej również zwracane jako
    JSON przez niektóre endpointy. W przypadku
    wykorzystania adnotacji
    @AssertTrue/@AssertFalse, podczas
    deserializacji wynik metody walidującej
    trafi do JSONa, a tego często nie chcemy.
    W takim przypadku nad metodą dodajemy
    adnotację @JsonIgnore.
     */
    @JsonIgnore
    @AssertTrue
    public boolean isAddressValid() {
        return address != null && address.split(" ").length >= 2;
    }
}