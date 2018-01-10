from flask import Flask, jsonify

app = Flask(__name__)

@app.route("/")
def hello():
    return "Hello World!"

@app.route("/health.json")
def health():
    return jsonify(status='UP')

