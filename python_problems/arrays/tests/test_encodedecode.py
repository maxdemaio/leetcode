from arrays.encodedecode import Codec


def test_lastStoneWeight():
    solution = Codec()

    input = ["lint", "code", "love", "you"]
    solution.decode(solution.encode(input)) == input
