class DeviceState:

    def __init__(self):
        self._device_id = None


    @property
    def device_id(self):
        return self._device_id
    
    
    @device_id.setter
    def device_id(self, id):
        self._device_id = id


device_state = DeviceState()