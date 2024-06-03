from settings.config import init_config, reset
from settings.prompt import prompt


def main():
    init_config()
    prompt.init()
    reset()


if __name__ == '__main__':
    main()