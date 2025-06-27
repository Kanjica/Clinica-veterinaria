/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Visual.Tutor;

import com.mycompany.clinicaveterinaria.Animal;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author joaog
 */
public class AnimalTableModel extends AbstractTableModel {

    private List<Animal> animais;
    private final String[] colunas = {"Nome", "Raça", "Data de Nascimento"};

    public AnimalTableModel(List<Animal> animais) {
        this.animais = animais;
    }

    // método para atualizar os dados da tabela
    public void setAnimais(List<Animal> animais) {
        this.animais = animais;
        fireTableDataChanged(); // notifica a tabela que os dados mudaram
    }

    @Override
    public int getRowCount() {
        return animais.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    public Animal getAnimalAt(int rowIndex) {
    return animais.get(rowIndex);
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Animal animal = animais.get(rowIndex);

        return switch (columnIndex) {
            case 0 -> animal.getNome();
            case 1 -> animal.getRaca();
            case 2 -> animal.getDataNascimento();
            default -> null;
        };
    }
}
