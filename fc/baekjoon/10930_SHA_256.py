# SHA-256
import hashlib

input_data  = input()

encode_data = input_data.encode()
print(encode_data)
result = hashlib.sha256(encode_data).hexdigest()


