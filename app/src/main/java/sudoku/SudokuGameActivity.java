package vn.edu.usth.sudoku;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.GridLayout;

public class SudokuGameActivity extends AppCompatActivity {
    private SudokuBoard sudokuBoard;
    private Button[][] buttons = new Button[9][9];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sudoku_game);

        sudokuBoard = new SudokuBoard();
        initializeBoard();
    }

    private void initializeBoard() {
        GridLayout gridLayout = findViewById(R.id.sudoku_grid);
        gridLayout.setRowCount(9);
        gridLayout.setColumnCount(9);

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                buttons[row][col] = new Button(this);
                buttons[row][col].setText(String.valueOf(sudokuBoard.getCell(row, col)));
                buttons[row][col].setLayoutParams(new GridLayout.LayoutParams());
                buttons[row][col].setOnClickListener(new CellClickListener(row, col));
                gridLayout.addView(buttons[row][col]);
            }
        }
    }

    private class CellClickListener implements View.OnClickListener {
        private final int row;
        private final int col;

        CellClickListener(int row, int col) {
            this.row = row;
            this.col = col;
        }

        @Override
        public void onClick(View v) {
            showNumberPicker(row, col);
        }
    }

    private void showNumberPicker(final int row, final int col) {
        // Logic to show a number picker dialog
    }
}