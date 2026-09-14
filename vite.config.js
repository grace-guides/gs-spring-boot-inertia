import { fileURLToPath, URL } from 'node:url'
import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'
import Components from "unplugin-vue-components/vite"

export default defineConfig(({ command }) => ({
  base: command === 'serve' ? '' : '/static/dist/',
  publicDir: false,
  build: {
    manifest: true,
    outDir: 'src/main/resources/public/dist',
    assetsDir: 'js',
    rollupOptions: {
      input: 'src/main/javascript/main.js'
    }
  },
  plugins: [
    vue(),
    Components({
      dirs: ['src/main/javascript/shared'],
    })
  ],
  resolve: {
    alias: {
      '@': fileURLToPath(new URL('./src/main/javascript', import.meta.url))
    }
  },
  server: {
    // Needed for changes to picked up when running in WSL on Windows
    watch: {
      usePolling: true
    },
  }
}))