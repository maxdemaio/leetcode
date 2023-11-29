from typing import List

"""
Approach/Notes:
Check comments

Time complexity:
O(n) with respect to how many cells are in the board
because we iterate over every cell but we also fail early!

Space complexity:
Since this grid is 9x9, it is fixed
but those data structures would scale linearly w/ the size of the grid
"""

class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        rows = {}
        cols = [{}, {}, {}, {}, {}, {}, {}, {}, {}]
        subs = [{}, {}, {}, {}, {}, {}, {}, {}, {}]

        # go over each row
        for i in range(0, len(board)):
            # validate current row and current col
            # while going over each cell in current row
            for j in range(0, len(board[i])):
                cell = board[i][j]
                if cell == ".":
                    continue
                # validate row/col
                if cell in rows or cell in cols[j]:
                    return False
                # populate row and col
                rows[cell], cols[j][cell] = 0, 0

                # Determine the subgrid index
                subgrid_index = (i // 3) * 3 + j // 3

                # populate and validate sub-grids
                # Check if the cell value is already in the subgrid
                if cell in subs[subgrid_index]:
                    return False  # Value is already in the subgrid, invalid Sudoku

                # populate the cell in the subgrid i
                subs[subgrid_index][cell] = 0

            rows = {}

        return True
