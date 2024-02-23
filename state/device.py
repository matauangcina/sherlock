class DeviceConnectionState(object):
    
    def __init__(self):
        self.device_id = None

    def set_device_id(self, device_id):
        self.device_id = device_id

    def get_device_id(self):
        return self.device_id


device_state = DeviceConnectionState()