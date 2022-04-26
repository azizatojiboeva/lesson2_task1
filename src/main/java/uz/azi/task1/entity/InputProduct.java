package uz.azi.task1.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

/**
 * @Author Aziza Tojiboyeva
 */
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class InputProduct {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long productId;

    private LocalDateTime expiry;

    private Double amount;

    private Double price;

    private Long inputId;

}
