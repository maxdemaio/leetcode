# python_problems

:octocat:

Keep in mind, I wrote all these in Python version `3.9.6`.

## Folder structure

```
python_problems/
├── category1/
│   ├── problem1.py
│   ├── problem2.py
│   ├── ...
│   └── tests/
│       ├── test_problem1.py
│       ├── test_problem2.py
│       ├── ...
├── category2/
│   ├── problem3.py
│   ├── problem4.py
│   ├── ...
│   └── tests/
│       ├── test_problem3.py
│       ├── test_problem4.py
│       ├── ...
└── ...

```

## Running the tests

If you have installed `pytest` locally within your project's venv or as a dependency in general, you can run the pytest command from the command line by specifying the Python interpreter along with the pytest module.

```
python3 -m pytest
```

This command will recursively discover and run all the test files in the current directory and its subdirectories.