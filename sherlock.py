from settings.config import init_config
from settings.logger import get_logger
from settings.prompt import prompt

log = get_logger(__name__)

def main():
    prompt.run()

if __name__ == '__main__':
    init_config()
    main()