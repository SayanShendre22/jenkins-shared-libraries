def call(){
echo "deploy stage will run next..."
                dir('django-notes-app') {  // Correct path (relative to workspace)
                 sh '''
                         docker compose up -d
                 '''
}
