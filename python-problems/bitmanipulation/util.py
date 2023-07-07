"""
Static util methods
"""


def show_bits(n: int) -> str:
    s = ""
    for i in range(31, -1, -1):
        s += str(((1 << i) & n) >> i)
    return s
