# maptool-poc

This for the target architecture of this POC:
![](https://www.plantuml.com/plantuml/png/dLLVQniv47_NfnZ8ItBKMteVe6rmsxiMJ0yQxWeb3rfflAj4grcaMU_vszz8bitwQcBeGt0q6ity_eoqxnFhoDFWLKJ3EdGUuOlUwMyVuQQBY64HlmysahDmq_e95_5_i8MRqONdHMmTAIMusQFtDAj0ZD0ICmqgLmSlMPFk47OOawC0RzuqeBu6lmVZTKgOW7lDe2E2v3klMuz0GUcAGNwXcrdT9XhmTCRe02s2jXOjCEMCkqQXv6O4gX9R_UYTP8J7jqTAglukTeIKahz5f53wgSQqUWi_1ZqoaL_rFFX7TLecZCAlUTBnyQXcKIAwhcUrfi3QXNH2lwKeh14s3yUJe3upK5Q5HeoQCSaAFZnyNQqFPnRaBdPjfh5Pu4kzZcZprWAbeOWbTBJh8aYKcdlkNUWWK5WPxp0mg3IYSLjdmBjdXByTpXkow8_uNgcDDf5MRXWz3YYrs55uLUpxk9DrEoMu_MCIKT_TgUBbXyzmQtNNOVpztHqWcmRkVI8mHoGgQxGk_JUOakxmJoddCQgvTwQ7QRH5gPmsP32bsnXfvwo4LG6uxdNeqAuAY0JwlCD1GZ3QUu6tSrfAdF3AHFtbDOjR0rYttMB4O30TPhLD7BLXjA1cnpsum1YtMlORUEXniIxvoeKdBEdRI0DKIwgwgz-oBGkBBrZMNBMt1gyPNEGIaPZQQGjRvyKyK8jHAoeUHrKTgaABF2C6g8Bb55L7u_Q-QY4T0fhiUt7pxW8VY-cPQVpvfaXGPTdC56CkMWz0xI4UICYGpDdiWgNvWDAxCFrR_ZkVkmHAJYmzS07-hsa3MHDXmuStP4g75_7Jzr9nsEs6Jz-RQoGMlYpikfvyTdtL-SDI7zapOMPignYN-Bv0jzoCt4NbS-U3PsWOA5GnDfJOxy5IGCWtOJTXDpEKwTRMkjn8U_Nb6-W40T6YpQFk4bWSFUs7WYso4mYi91m8f78PCMWdXipjzLDwRTB5vonlNzUpVXTAj7wWpdIg-x-crR7V9NYry8kklvTZq-3_0m00) 

##Note to self:
For superdevmode to get updates from changed html templates you have to set "Production sources directory" in
intellij ("File"->"Settings"->"Build, Execute, Deployment"->"Compiler"->"Annotation Processors") to "." for the html
project. This is necessary each time after you sync intellij with gradle.

## Gradle

This project uses [Gradle](http://gradle.org/) to manage dependencies.
The Gradle wrapper was included, so you can run Gradle tasks using `gradlew.bat` or `./gradlew` commands.
Useful Gradle tasks and flags:

- `--continue`: when using this flag, errors will not stop the tasks from running.
- `--daemon`: thanks to this flag, Gradle daemon will be used to run chosen tasks.
- `--offline`: when using this flag, cached dependency archives will be used.
- `--refresh-dependencies`: this flag forces validation of all dependencies. Useful for snapshot versions.
- `android:lint`: performs Android project validation.
- `build`: builds sources and archives of every project.
- `clean`: removes `build` folders, which store compiled classes and built archives.
- `html:gwtDev`: compiles GWT sources and runs the application in SuperDev mode. Use only during development.
- `desktop:jar`: builds application's runnable jar, which can be found at `desktop/build/libs`.
- `desktop:run`: starts the application.
- `server:run`: runs the server application.
- `test`: runs unit tests (if any).

Note that most tasks that are not specific to a single project can be run with `name:` prefix, where the `name` should be replaced with the ID of a specific project.
For example, `core:clean` removes `build` folder only from the `core` project.