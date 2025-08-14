import pytest


@pytest.fixture
def num_list():
 
    int_list = list(range(11))

    return int_list