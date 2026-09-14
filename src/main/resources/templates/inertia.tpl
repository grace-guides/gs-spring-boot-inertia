yieldUnescaped '<!DOCTYPE html>'
html(lang:'en') {
	head {
		title('Inertia Template')
        script(type: 'module', src: 'http://localhost:3000/@vite/client') {}
        script(type: 'module', src: 'http://localhost:3000/src/main/javascript/main.js') {}
	}
	body {
		script('data-page': 'app', type: 'application/json', page.toJson())
		div(id: 'app') {}
	}
}